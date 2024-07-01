%% Lab 12
% Thomas Nocera

%% Problem 1

homerun(45,pi/4,0.986);

%% Problem 2

xfence = 120;
yfence = 3;
x = homerun(43.842,.7204,0.986);

yball = interp1(x(:,1),x(:,2),xfence);

if yball > yfence
    fprintf('Homerun! The height of the ball at the fence is %f\n', yball);
else
    fprintf('Fly Ball. The height of the ball at the fence is %f\n', yball);
end

%% Problem 3

close all;

xfence = 120;
yfence = 3;

x = homerun(43.842,.7204,0.986);
w = homerun(43.842,.7204,0);

hold on;

plot(x(:,1),x(:,2),'b-');
plot(w(:,1),w(:,2),'m--');

xlim([0 150]);
ylim([0 50]);
xlabel('distance (meters)');
ylabel('height (meters)');
title('Trajectory of ball');
legend('Denver','Vaccum');

plot([120 120],[0 3],'k-','linewidth',2);

%% Problem 4

close all;

xfence = 120;
yfence = 3;

x = homerun(46.4,.7204,1.196);
w = homerun(46.4,.7204,0);

hold on;

plot(x(:,1),x(:,2),'b-');
plot(w(:,1),w(:,2),'m--');

xlim([0 150]);
ylim([0 50]);
xlabel('distance (meters)');
ylabel('height (meters)');
title('Trajectory of ball');
legend('Fenway','Vaccum');

plot([120 120],[0 3],'k-','linewidth',2);

%% Problem 5

% In Fenway the ball needs to be hit at 103.79 miles/hour, at 41.27 degrees
% to get a homerun.
% In Denver you need to hit the ball at 98.07 miles/hour at 41.27 degrees
% to get a homerun.