var euler2 = function () {
    return fibs (1, 1, 0);
};

var fibs = function (a, b, acc) {
    if (a >= 4000000) return acc;
    else if (a % 2 === 0) return fibs(a + b, a, acc + a)
    else return fibs(a + b, a, acc);
};
