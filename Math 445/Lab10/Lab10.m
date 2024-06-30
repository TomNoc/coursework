%% Lab 10
% Thomas Nocera

%% Problem 1

close all
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
z = 2*exp((-(X-1).^2) - (Y-1).^2) + exp((-(X+1).^2) - Y.^2);
surf(x,y,z);
zlim([0 2]);
xlim([-3 3]);
ylim([-3 3]);
title('Monte Sol and Monte Luna')
colormap('jet');

%% Problem 2

close all
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
contour(x,y,z);
hold on 
dfdx = 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy = 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
quiver(x,y,dfdx,dfdy);
xlabel('x');
ylabel('y');
title('problem 2: contours of height and direction and steepest descent')
colorbar();
colormap('jet');
ylim([-2 3]);

%% Problem 3

close all
dfdx =@(X,Y) 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy =@(X,Y) 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
x = [0.9 0.9];
delta = 0.1;
for i = 2:100
    x(i,:) = [(delta*dfdx(x(i-1,1),x(i-1,2))+x(i-1,1)) (delta*dfdy(x(i-1,1),x(i-1,2))+x(i-1,2))];
end
plot(x(:,1),x(:,2),'b-');
hold on
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
contour(x,y,z);
dfdx = 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy = 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
quiver(x,y,dfdx,dfdy);
xlabel('x');
ylabel('y');
colorbar();
colormap('jet');
ylim([-2 3]);
title('problem 3: path of raindrop from (x,y) = (0.9, 0.9)');

%% Problem 4

close all
z =@(X,Y) 2*exp((-(X-1).^2) - (Y-1).^2) + exp((-(X+1).^2) - Y.^2);
dfdx =@(X,Y) 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy =@(X,Y) 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
x = [0.9 0.9 z(0.9,0.9)];
delta = 0.1;
for i = 2:100
    x(i,:) = [(delta*dfdx(x(i-1,1),x(i-1,2))+x(i-1,1)) (delta*dfdy(x(i-1,1),x(i-1,2))+x(i-1,2)) z(delta*dfdx(x(i-1,1),x(i-1,2))+x(i-1,1),delta*dfdy(x(i-1,1),x(i-1,2))+x(i-1,2))];
end
plot3(x(:,1),x(:,2),x(:,3),'b-')
hold on
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
z = 2*exp((-(X-1).^2) - (Y-1).^2) + exp((-(X+1).^2) - Y.^2);
surf(x,y,z);
colormap('white');
zlabel('h(x,y)');
xlabel('x');
ylabel('y');
title('problem 4: 3d path of raindrop from (x,y) = (0.9, 0.9)');

%% Problem 5

close all
z = 2*exp((-(X-1).^2) - (Y-1).^2) + exp((-(X+1).^2) - Y.^2);
x0 = [0.9; 0.9];
[t, x] = ode45(@v, 0:0.1:20, x0);
plot(x(:,1),x(:,2),'b-');
hold on
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
contour(x,y,z);
dfdx = 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy = 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
quiver(x,y,dfdx,dfdy);
xlabel('x');
ylabel('y');
colorbar();
colormap('jet');
ylim([-2 3]);
title('problem 5: path of raindrop from (x,y) = (0.9, 0.9)');

%% Problem 6

close all
hold on
for i = 1:100
    x0 = [4*rand()-2; 3*rand()-1];
    [t, x] = ode45(@v, 0:0.1:20, x0);
    plot(x(:,1),x(:,2),'b-');
end
x = linspace(-3,3,40);
y = linspace(-3,3,40);
[X,Y] = meshgrid(x,y);
contour(x,y,z);
dfdx = 4*(X-1).*exp(-(Y-1).^2 - (X-1).^2) + 2*(X+1).*exp(-Y.^2 - (X+1).^2);
dfdy = 4*(Y-1).*exp(-(X-1).^2 - (Y-1).^2) + 2*Y.*exp(-(X+1).^2 - Y.^2);
quiver(x,y,dfdx,dfdy);
xlabel('x');
ylabel('y');
colorbar();
colormap('jet');
ylim([-2 3]);
title('problem 6: path of 100 raindrops dropped from random');