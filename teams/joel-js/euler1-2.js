var euler = (function () {
    // euler is a collection of functions (in the functional/module pattern)
    // problems can be found at http://projecteuler.net
    var e = {};
    e.one = function (from, to, total) {
        var total = total || 0;
        return from < to ?
            from % 3 === 0 || from % 5 === 0 ?
                e.one(from + 1, to, from + total) :
                e.one(from + 1, to, total) :
            total;
    };
    e.two = function (max, last, next, total) {
        last = last || 0, next = next || 1, total = total || 0;
        return next < max ?
            (last + next) % 2 === 0 ?
                e.two(max, next, last + next, total + (last + next)) :
                e.two(max, next, last + next, total) :
            total;
    };
    return e;
}());
