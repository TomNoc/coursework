%% Lab7
% Thomas Nocera

%% Problem 2

%a
f=@(x) x.^3 - 7.*x - 13;
y = 13;
newtonsearch(f,y)
f(3.3063)

%b
g=@(x) x.^3 - 72
newtonsearch(g,2)
g(4.1602)
(72)^(1/3)

%c
r=@(x) sqrt(4 - x.^2) - x.*tan(x)
newtonsearch(r,1)
r(1.0299)

%% Problem 3

Ti = 20;
alpha = .138 * 10^(-6);
Ts = -15;
T = 0;
t = 5184000;
Tf=@(x) erf(x./sqrt(2.*alpha.*t)).*(Ti - Ts) + Ts;
x = -10:0.1:10;
plot(x,Tf(x),'r.-');
newtonsearch(Tf,0.5)
Tf(.4787)