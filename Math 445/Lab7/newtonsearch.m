function x = newtonsearch(f, xguess)
    x = xguess;
    eps = 1e-7;
    for i = 1:10
        fprime = (f(x + eps) - f(x)) / eps;
        dx = -1 * f(x) / fprime;
        x = x + dx;
        if (abs(f(x))<eps) || (abs(dx)<eps)
            break;
        end
    end
end