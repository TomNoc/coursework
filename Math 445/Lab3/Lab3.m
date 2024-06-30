%% Lab 3
% Thomas Nocera

%% Problem 1

x = linspace(-1,5,100);
f = x.^3 - 5*x.^2 + 2*x + 3;
plot(x,f,'b.-');
axis square;
title('Math 445 Lab 3 Problem 1');
xlabel('x');
ylabel('f');

%% Problem 2

x = linspace(0,4,100);
y = 147*10.^(-2*x);
semilogy(x,y,'m.--');
grid on;
title('Math 445 Lab 3 Problem 2');
xlabel('x');
ylabel('y');

%% Problem 3

x = logspace(0,5,100);
y = 0.3*log(x) + 2;
semilogx(x,y,'c.-.');
xlabel('x');
ylabel('y');
title('Math 445 Lab 3 Problem 3');

%% Problem 4

x = logspace(1,4,100);
y = 10*x.^(-3);
loglog(x,y,'g.-');
grid on;
title('Math 445 Lab 3 Problem 4');
axis([1 10^5 10^-11 10^-2]); 
%I am assuming you wanted 10^0 rather than 0 for xmin because 0 would never exist of a loglog graph
xlabel('x');
ylabel('y');

%% Problem 5

data = load('earthquake_magnitude.asc');
M = data(:,1);
N = data(:,2);
c = 10^(7.35);
m = -6.2/7;
x = M;
y = c*10.^(m*x);
semilogy(M,N,'ro-',x,y,'b.-');
grid on;
legend('Data','Formula: y(x)=10^{7.35}*10 ^{(-6.2/7)x}');
xlabel('Magnitude');
ylabel('Frequency');

%% Problem 6

data = load('earthquake_energy.asc');
E = data(:,1);
N = data(:,2);
m = -10.5/6.1;
c = 10^(17.3);
x = N;
y = c*x.^m;
loglog(N,E,'ro-',x,y,'b.-');
grid on;
legend('Data','Formula: y(x)=10^{17.3}*x^{-10.5/6.1}');
xlabel('Frequency');
ylabel('Energy (Joules)');

%% Problem 7

data = load('world_population.asc');
t = data(:,1);
P = data(:,2);
x = t;
m = 1/150;
c = 10^(-3.56);
y = c*10.^(m*x);
loglog(t,P,'ro-',x,y,'b.-');
grid on;
legend('Data','Formula: y(x)=10^{-3.56 + x/150}');
xlabel('Year');
ylabel('Population');
%We can extrapolate that population will reach 1 trillion (i.e 10e12) in the year 2334.
%The first human would be born in the year 534.
%I do not believe these answers because we know for a fact humans have been around for longer than 1500 years, and also I don't think the planet could sustain one trillion people.