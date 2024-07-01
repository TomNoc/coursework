%% Lab 8
% Thomas Nocera

%% Problem 1

ONH = 51.5;
RNH = 47.8;
margin = 3.4;
ONHwins = 0;
RNHwins = 0;
for n = 1:1000
    r = margin*(2*rand() - 1);
    ONHvotes = ONH + r;
    RNHvotes = RNH - r;
    if ONHvotes > RNHvotes
        ONHwins = ONHwins + 1;
    else
        RNHwins = RNHwins + 1;
    end
end
fprintf('%i Obama and %i Romney\n', ONHwins, RNHwins);

%% Problem 2

rwinsboth = 0;
rwinsCO = 0;
rwinsNH = 0;
rwinsnone = 0;
for n = 1 :1000
    if not(electoral(50.9,48.2,3,9)) && not(electoral(51.5,47.8,3.4,4))
        rwinsboth = rwinsboth + 1;
    elseif not(electoral(50.9,48.2,3,9)) && electoral(51.5,47.8,3.4,4)
        rwinsCO = rwinsCO + 1;
    elseif electoral(50.9,48.2,3,9) && not(electoral(51.5,47.8,3.4,4))
        rwinsNH = rwinsNH + 1;
    else
        rwinsnone = rwinsnone + 1;
    end
end
rwinsboth = rwinsboth/10;
rwinsCO = rwinsCO/10;
rwinsNH = rwinsNH/10;
rwinsnone = rwinsnone/10;
fprintf('Romney wins both %%%.1f\nRomney wins CO %%%.1f\nRomney wins NH %%%.1f\nRomney wins neither %%%.1f\n',rwinsboth,rwinsCO,rwinsNH,rwinsnone)

%% Problem 3

B = load('P.asc');
Ntrials = 10000;
totalOvotes = zeros(1,Ntrials);

for n = 1:Ntrials
    Ovotes = 0;
    for k = 1:size(B(:,1));
        A = B(k,:);
        O = A(1);
        R = A(2);
        M = A(3);
        E = A(4);
        if electoral(O,R,M,E)
            Ovotes = Ovotes + E;
        end
    end
    totalOvotes(n) = Ovotes;
end

totalRvotes = 540 - totalOvotes;
histogram(totalOvotes,10)
hold on
histogram(totalRvotes,10)
xlim([0 540]);

sum(totalOvotes >= 270)
% Obama is likely to win he wins nearly 99% of the simulations
% He is 99% likely to win
% Obama is most likely to get between 309 and 320 based on the current graph

tie = sum(totalOvotes == 269)/100;
fprintf('Obamas chances of tying is %%%f\n',tie);

