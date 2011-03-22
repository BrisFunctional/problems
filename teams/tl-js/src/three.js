var euler3 = function (num) {
    return highest_prime_factor(num, 2);
};

var highest_prime_factor = function(num, div) {
    if (num === div) return num;
    else if (num % div !== 0) return highest_prime_factor(num, div + 1);
    else return highest_prime_factor(Math.floor(num / div), div);
};
