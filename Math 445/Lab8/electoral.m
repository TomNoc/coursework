function winner = electoral(O,R,M,E)
    Owins = 0;
    Rwins = 0;
    r = M*(2*rand() - 1);
    Ovotes = O + r;
    Rvotes = R - r;
    if Ovotes > Rvotes
        Owins = Owins + 1;
    else
        Rwins = Rwins + 1;
    end
    if Owins > Rwins
        winner = true;
    else
        winner = false;
    end
end
