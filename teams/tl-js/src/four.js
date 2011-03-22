Functional.install();

var euler4 = function () {
    return reduce(Math.max, 0, select(isPalendrome, products()));
};

var isPalendrome = function (num) {
    return String(num).split("").reverse().join("") === String(num);
};

var products = function () {
    var result = []
    for(var i = 100; i <= 999; i++) {
        for(var j = 100; j <= 999; j++) {
            result.push(i * j);
        }
    }
    return result;
};


