var RectOperation;
(function (RectOperation) {
    var rectangle;
    (function (rectangle) {
        function area(length, width) {
            console.log("area of rectangle-" + length * width);
        }
        rectangle.area = area;
        function perimeter(length, width) {
            console.log("perimeter of rectangle-" + (2 * (length + width)));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = RectOperation.rectangle || (RectOperation.rectangle = {}));
})(RectOperation || (RectOperation = {}));
RectOperation.rectangle.area(20, 51);
RectOperation.rectangle.perimeter(10, 20);
