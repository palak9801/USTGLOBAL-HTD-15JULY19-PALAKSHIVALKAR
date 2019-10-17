function printConstructor(cons:Function){
    console.log(cons);

}

@printConstructor

class Sample{
    constructor(){
        console.log('sample class constructor');
    }
}