namespace RectOperation{
    export namespace rectangle{
        export function area(length:number,width:number){
            console.log("area of rectangle-"+length*width);
        }
        export function perimeter(length:number,width:number){
            console.log("perimeter of rectangle-"+(2*(length+width)));
        }
    }
}
RectOperation.rectangle.area(20,51);
RectOperation.rectangle.perimeter(10,20);