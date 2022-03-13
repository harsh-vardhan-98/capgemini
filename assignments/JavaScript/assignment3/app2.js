class Rectangle{
     constructor(height,width){
          this.height = height;
          this.width = width;
     }

     area(){
          return this.height*this.width;
     }
     
}

var box = new Rectangle(10,20);
console.log("height is "+box.height + " width is  " +box.width +" and area is "+  box.area());