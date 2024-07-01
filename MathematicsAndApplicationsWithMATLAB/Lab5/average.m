function a = average(x)
    n = length(x);
    p = 0;
    for i = 1:n
        p = p + x(i);
    end
    a = p/n;
end