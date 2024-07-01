function y = matvecmult(A,x)
    [m,n] = size(A);
    y = zeros(m,1);
    for j = 1:m
        p = 0;
        for i = 1:n
            p = (A(j,i) * x(i)) + p;
        end
        y(j) = p;
    end
end