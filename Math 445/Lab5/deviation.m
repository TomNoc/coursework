function s = deviation(x)
    p = 0;
    n = length(x);
    m = average(x);
    for i = 1:n
        p = p + (x(i) - m)^2;
    end
    s = sqrt((1/(n-1))*p);
end