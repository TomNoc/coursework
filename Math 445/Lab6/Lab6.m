%% Lab6
% Thomas Nocera

%% Problem 1

% a
%P1 = 1/3 p2
%P2 = 1/2 p5 + 1/2 p6
%P3 = 1/2 p1 + 1/3 p2
%P4 = 1/3 p3 + 1/2 p8
%P5 = 1/2 p1 + 1/3 p3
%P6 = 1/2 p4 + 1/2 p5 + p7
%P7 = 1/3 p2 + 1/2 p3 + 1/2 p8
%P8 = 1/2 p4 + 1/2 p6

% b

A = zeros(8,8);
A(1,2) = 1/3;
A(2,[5,6]) = [1/2, 1/2];
A(3,[1,2]) = [1/2,1/3];
A(4,[3,8]) = [1/3,1/2];
A(5,[1,3]) = [1/2,1/3];
A(6,[4,5,7]) = [1/2,1/2,1];
A(7,[2,3,8]) = [1/3,1/2,1/2];
A(8,[4,6]) = [1/2,1/2];

% c

p0 = [1/8;1/8;1/8;1/8;1/8;1/8;1/8;1/8];
N = 100; 
P = p0;
for n = 1:N
    %bar(P);
    %pause;
    P = A * P;
end
P

% d

sort(P)

%% Problem 2

%a
M = 100;
[w,L] = surfer('http://www.unh.edu',M);

%b
i = find(L == 1);
j = find(L == 0);
length(i) + length(j)

%c

A = zeros(M,M);
for j = 1:M    %Setting A's columns
    s = sum(L(:,j));
    if s == 0 
        A(:,j) = ones(M,1)/M;
    else A(:,j) = L(:,j)/s;
    end
end

%d

alpha = 0.15;
B = (1-alpha)*A + alpha*ones(M,M)/M;    %Making B with alpha = 0.15

%e

for k = 1:M    %Checking that B's columns sum to 1
    s = sum(B(:,k),1);
    if abs(s - 1)/100 > eps
        fprintf('column %i does not add to 1\n',k);
    end
end

%f

p = zeros(M,1);
p(1) = 1;
N = 40;
for n = 1:N
    p = B * p;
end

[Q,I] = sort(p);
W = w;
for i = 1:length(I)
    W(i) = W(I(i));
end

for i = 1:10
    k = W{length(W) + 1 - i};
    l = Q(length(Q) + 1 - i)*100;
    fprintf('%02i. %-70s %%%07.4f\n',i,k,l);
end

%% Problem 3

%It sounds like using this method to give a popularity quotient would give
%a fairly rough but useful estimate. It keeps in mind social circles and
%also has the teleportation matrix which keeps in mind random meetings.
%Although the main flaw would be that different people would have different
%teleportation percentages, but overall this would give a decent estimate.
%My answer says that google page rank is useful and you can see this in
%your everday life when you use google and the page you're looking for is
%in the top 3 links.