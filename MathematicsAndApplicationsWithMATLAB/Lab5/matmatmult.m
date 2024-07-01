function C = matmatmult(A,B)
    [m,n] = size(A);
    [n,p] = size(B);
    C = zeros(m,p);
    for i = 1:m;
        for j = 1:p
            s = 0;
            for k = 1:n
                s = A(i,k) * B(k,j) + s;
            end
            C(i,j) =  s;
        end
    end
end