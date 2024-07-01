%% Lab 9
%Thomas Nocera

%% Problem 1

x = linspace(-pi, pi, 30);
y = linspace(-pi, pi, 30);
[X,Y] = meshgrid(x,y);
z = cos(X).*sin(Y);
pcolor(X,Y,z)
axis equal
axis tight

subplot(2,2,1)
pcolor(X,Y,z)
shading faceted

subplot(2,2,2)
pcolor(X,Y,z)
shading flat

subplot(2,2,3)
pcolor(X,Y,z)
shading interp

%% Problem 2

x = linspace(-pi,pi,20);
y = linspace(-pi,pi,20);
[X,Y] = meshgrid(x,y);
z = cos(X).* sin(Y);
surf(x,y,z)
colorbar()

%% Problem 3

x = linspace(-10,10,100);
y = linspace(-10,10,100);
[X,Y] = meshgrid(x,y);
r = sqrt(X.^2 + Y.^2);
z = 5*sin(r)./r;
surf(x,y,z)
shading interp

%% Problem 4

x= linspace(-pi,pi,100);
y= linspace(-pi,pi,100);
[X,Y] = meshgrid(x,y);
z1 = cos(X./2) .* sin(Y./2);
z2 = sin(X) .* cos(Y./2);
z3 = cos(X./2) .* sin(Y);
z4 = sin(X) .* sin(Y);

subplot(2,2,1)
surf(x,y,z1)
shading interp

subplot(2,2,2)
surf(x,y,z2)
shading interp

subplot(2,2,3)
surf(x,y,z3)
shading interp

subplot(2,2,4)
surf(x,y,z4)
shading interp

%% Problem 5

[phi,theta] = meshgrid(linspace(0,2*pi,100));
X = (cos(phi) + 3) .* cos(theta);
Y = (cos(phi) + 3) .* sin(theta);
Z = sin(phi);
C = sin(3*theta);
surf(X,Y,Z,C)
shading interp
%The image produces a donut shaped graph, which maps 2 variables to 4
%C is a variable and is represented by the colors at each point on the
%donut, this is the only way it can be represented because its a 4th
%dimension

%% Problem 6
close all
x = linspace(-3,3,50);
y = linspace(-3,3,50);
[X,Y] = meshgrid(x,y);
z = 2*exp((-(X-1).^2) - (Y-1).^2) + exp((-(X+1).^2) -Y.^2);
surf(x,y,z)
colormap('jet');
axis([-3 3 -3 3 0 2]);
title('Monte Sol and Monte Luna');

figure()
contourf(x,y,z)
hold on
dfdx = -4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) - 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy = -4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) - 2*Y.*exp(-(X+1).^2 - Y.^2);
quiver(x,y,dfdx,dfdy)

%% Problem 7

close all
x = linspace(0,1,50);
y = linspace(0,1,50);
[X,Y] = meshgrid(x,y);

v0 = 1;

vx = v0 .* X;
vy = -1 * v0 .* Y;

quiver(x,y,vx,vy)
xlabel('V0 * X');
ylabel('-V0 * Y');
title('Invicid 2d Fluid Flow');


%% Problem 8

close all
x = linspace(-3,3,50);
y = linspace(0,3,50);
[X,Y] = meshgrid(x,y);

a = 1;
v0 = 1;

vx = v0 * (1 - a^2 * (X.^2 - Y.^2) ./ (X.^2 + Y.^2));
vy = -2 * a * v0 * (X * Y) ./ ((X.^2 + Y.^2).^2);

vx = (X.^2 + Y.^2 > a) .* vx;
vy = (X.^2 + Y.^2 > a) .* vy;

quiver(x,y,vx,vy);
xlabel('V0(1 - a^2(X.^2 - Y^2)/(X^2 + Y^2))');
ylabel('-2aV0(XY)/((X^2 + Y^2)^2)');
title('Inviscid 2d Fluid Flow Past a Semicircular Bump');
axis equal
hold on

x = linspace(-a,a,50);
y = linspace(0,a,50);
R = sqrt(a^2 - x.^2);

plot(x,R,'b.-');




