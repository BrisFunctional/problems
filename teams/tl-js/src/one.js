var euler1 = function () {
    return sum_recursive(1, 0);
};

var sum_recursive = function (num, acc) {
    if(num >= 1000) {return acc;}
    else if(num % 3 === 0 || num % 5 === 0) {return sum_recursive(num + 1, acc + num);}
    else {return sum_recursive(num + 1, acc);}
};
