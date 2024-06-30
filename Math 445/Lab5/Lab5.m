%% Lab5
% Thomas Nocera

%% Problem 1

for i = 1:10
    d = pi * i;
    fprintf('%i times pi is %f\n',i,d);
end

%% Problem 2

%Function in file called farenheit2celsius.m
farenheit2celsius(20);

%% Problem 3

for i = -10:10:100
    farenheit2celsius(i);
end

%% Problem 4

%Function in file called average.m
x = rand(100,1);
average(x)
mean(x)


%% Problem 5

%Function is in file called deviation.m
x = randn(100,1);
deviation(x)
std(x)

%% Problem 6

A = rand(4,4);
x = rand(4,1);
matvecmult(A,x)
A * x

%% Problem 7

A = rand(5,3);
B = rand(3,5);
matmatmult(A,B)
A * B