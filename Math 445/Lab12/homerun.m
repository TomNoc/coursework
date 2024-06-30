function y = homerun(v0, theta0, rho_air)

%rho_air  = 1.196;   kg/m^3, density of dry air, 21 C, sea level   (Fenway)
%rho_air  = 0.986;   kg/m^3, density of dry air, 21 C, 1 mile high (Denver)
%rho_air  = 0        Vaccum

ic = [0; 1; v0*cos(theta0); v0*sin(theta0)];

C_D = 0.3;       % drag coefficient for baseball (rough sphere)
g = 9.81;        % acceleration due to gravity in m/s^2
r = 0.0375;      % radius of baseball in m (3.75 cm)
A = pi*r^2;      % cross-sectional area of baseball in m^2
m = 0.145;       % mass of baseball in kg (145 gm

mu = rho_air*C_D*A/2; % coefficient of nonlinear |v|^2 term, in mks units

f =@(t, x) [x(3); x(4); (-mu / m)*x(3)*sqrt(x(3).^2+x(4).^2);(-mu / m)*x(4)*sqrt(x(3)^2+x(4)^2) - g];
[t, x] = ode45(f,[0 6],ic);

y = x;
end





