%% Lab 11
% Thomas Nocera

%% Problem 1

close all;
g = 9.8;
l = 1;
theta0 = [.1; 0];

f =@(t, x) [x(2);  -(g / l) * x(1)];

[t, x] = ode45(f,[0,10],theta0);

subplot(2,2,1);
plot(t,x(:,1),'b.-');
xlim([0 5])
ylim([-0.4 0.4])
title('linear undamped pendulum, theta vs time')
xlabel('time')
ylabel('?');
subplot(2,2,2);
plot(t,x(:,2),'r.-');
xlim([0 5]);
ylim([-0.4 0.4]);
title('linear undamped pendulum, dtheta/dt vs time');
xlabel('time');
ylabel('dtheta/dt');
subplot(2,2,3);

plot(x(:,1),x(:,2),'b-');
hold on;
xlim([-.2 .2]);
ylim([-.5 .5]);

x1 = linspace(-.2, .2, 21);
x2 = linspace(-.5, .5, 21);
[X1,X2] = meshgrid(x1,x2);
F1 = X2;
F2 = - (g / l) * X1;

quiver(x1,x2,F1,F2);

title('linear undamped pendulum, ? vs d?/dt');
xlabel('?');
ylabel('d?/dt');

%% Problem 2

close all;
g = 9.8;
l = 1;
alpha = 1;
m = 1;
theta0 = [.1; 0];

f =@(t, x) [x(2);  -(g / l) * x(1) - (alpha/m) * x(2)];

[t x] = ode45(f,[0,10],theta0);

subplot(2,2,1);
plot(t,x(:,1),'b.-');
xlim([0 5]);
ylim([-0.4 0.4]);
title('linear damped pendulum, d?/dt vs time');
xlabel('time');
ylabel('?');
subplot(2,2,2);
plot(t,x(:,2),'r.-');
title('linear damped pendulum, d?/dt vs time');
xlabel('time');
ylabel('d?/dt');
xlim([0 5]);
ylim([-0.4 0.4]);
subplot(2,2,3);

plot(x(:,1),x(:,2),'b-');
hold on;
xlim([-.1 .15]);
ylim([-.35 .2]);

x1 = linspace(-.1, .15, 21);
x2 = linspace(-.35, .2, 21);
[X1,X2] = meshgrid(x1,x2);
F1 = X2;
F2 = - (g / l) * X1 - (alpha/m) * X2;

quiver(x1,x2,F1,F2);

title('linear damped pendulum, ? vs d?/dt');
xlabel('?');
ylabel('d?/dt');

%% Problem 3

close all;
g = 9.8;
l = 1;
theta0 = [.5; 0]; %theta0's recorded in data.asc

f =@(t, x) [x(2);  -(g / l) * sin(x(1))];
[t,x] = ode45(f,[0,10],theta0);

T = load('data.asc');

omega = 2*pi./T(:,2)

plot(T(:,1),omega,'bo');
hold on

c = -.2

subplot(2,2,1);
x1 = linspace(0,2,100);
omega1 = sqrt(g/l)+c.*x1.^2;
plot(x1,omega1,'r-');
title('theta0 versus omega');
xlabel('omega');
ylabel('theta0');

subplot(2,2,2);
plot(x(:,1),x(:,2),'b-');
xlim([-8 8]);
ylim([-10 10]);
xlabel('theta');
ylabel('dtheta/dt');
hold on;

x1 = linspace(-8, 8, 21);
x2 = linspace(-10, 10, 21);
[X1,X2] = meshgrid(x1,x2);
F1 = X2;
F2 = - (g / l) * sin(X1);

quiver(x1,x2,F1,F2);

% The value of c is the constant that determines the quadradic relation
% between omega and theta
% A real pendulum would run slower than this because it would have air
% resistence

%% Problem 4

close all;
g = 9.8;
l = 1;
m = 1;
alpha = 1;

for i = -10:1:10
    
    theta0 = [0;i];

    f =@(t, x) [x(2);  -(g / l) * sin(x(1)) - alpha / m*x(2)];
    [t,x] = ode45(f,[0,20],theta0);

    plot(x(:,1),x(:,2),'b-');
    xlim([-8 8]);
    ylim([-10 10]);
    xlabel('theta');
    ylabel('dtheta/dt');
    hold on;

end

x1 = linspace(-8, 8, 21);
x2 = linspace(-10, 10, 21);
[X1,X2] = meshgrid(x1,x2);
F1 = X2;
F2 = - (g / l) * sin(X1) - (alpha/m) * X2;

quiver(x1,x2,F1,F2);

% a.) The nonlinear pendulum can vary a lot more and has much more
% unpredictable movements.

% b.) The first movement is it just going in foreverback and forth, the
% second would be it making a loop forever

% c.) They all settle at dtheta/dt = 0, meaning it stops, the two side ones
% i think make a loop, and goes all the way around back to its starting
% point, one going one way the other the other way.

% d.) There would be an infinite amount of trajectories that make different
% loops, that then converge to npi where n is an integer.
