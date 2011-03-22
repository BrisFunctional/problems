Functional.install();

var euler5 = function () {
    var list = [],
    step = 20*19*18*17;
    for(var i=2; i <= 20; i++) { list.push(i); }
    return lcm(step, list, step);
};

var lcm = function (num, list, step) {
    if (reduce('+', 0, map(function (x) {return num % x;}, list)) === 0) return num;
    else return lcm(num + step, list, step);
};
