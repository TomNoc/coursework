%% Lab 4
% Thomas Nocera

%% Problem 1

% 1a

x = [4 3 8]
y = [2; 1; -4]
a1 = x * y

% 1b

x = [9 1 0]
y = [-5; 6; 2]
b1 = x * y

% 1c

A = [3 1; 2 -7]
x = [2; 1]
c1 = A * x

% 1d

B = [4 -6; 0 2]
d1 = A * B

%% Problem 2
% Problem 1b was not well posed because in order to do matrix
% multiplication the number of rows in the first matrix needs to equal the
% number of columns of the it's multiplied with.

%% Problem 3
A = [4 2; -1 5]
b = [3; 4]
a3 = A \ b

%% Problem 4

% 4a

A = [2 -1; 6 -5]
b = [8; 32]
a4 = A \ b

% 4b

A = [0 1 1; 3 -1 1; 1 1 -3]
b = [6; -7; -13]
b4 = A \ b

% 4c

A = [2 1 -3; 6 3 -8; 2 -1 5]
b = [0; 0; -4]
c4 = A \ b

%% Problem 5
A = [1 1; 25 5]
b = [40; 640]
x = A \ b
a5 = A * x
%22 Quarters; 18 Nickels

%% Problem 6
A = [1 1 1; 25 10 5; 0 2 -1]
b = [44; 750; 0]
x = A \ b
a6 = A * x
% It is not possible for all of these conditions to be satisfied with an integer
% number of coins, thus Suhasini must be lying.

%% Problem 7
A = zeros(13,13)
b = zeros(13,1)
x = 1/sqrt(2)
A(1,[2 6]) = [1 -1]
A(2,3) = 1
b(2,1) = 10
A(3,[1 4 5]) = [x -1 -x]
A(4,[1 3 5]) = [x 1 x]
A(5,[4 8]) = [1 -1]
A(6,7) = 1
A(7,[5 6 9 10]) = [x 1 -x 1]
A(8,[5 7 9]) = [x 1 x]
b(8,1) = 15
A(9,[10 13]) = [1 -1]
A(10,11) = 1
b(10,1) = 20
A(11,[8 9 12]) = [1 x -x]
A(12,[9 11 12]) = [x 1 x]
A(13,[12 13]) = [1 x]

a7 = A \ b
