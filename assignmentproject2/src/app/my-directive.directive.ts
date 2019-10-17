import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef:ElementRef) {
    elementRef.nativeElement.style.backgroundColor='cyan';
    elementRef.nativeElement.style.color='blue';
    elementRef.nativeElement.style.padding="60px";
    elementRef.nativeElement.style.marginTop = "30px";
    elementRef.nativeElement.style.fontSize="30px";
   }

   @HostBinding('style.background') background: string;

    @HostListener( 'mouseenter' )
   mouseEnter(){
    //  console.log();

    //  alert('mouse entered');

    // this.elementRef.nativeElement.style.background='yellow';
    // this.elementRef.nativeElement.style.color='white';
    // this.elementRef.nativeElement.style.fontSize='40px';

    this.background="skyblue";

   }

   @HostListener('mouseleave')
   mouseLeave(){
    //  console.log();
    //  alert('mouse entered');
    // this.elementRef.nativeElement.style.background='green';
    // this.elementRef.nativeElement.style.color='red';
    // this.elementRef.nativeElement.style.fontSize='20px';
    this.background="purple";
   }

}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 