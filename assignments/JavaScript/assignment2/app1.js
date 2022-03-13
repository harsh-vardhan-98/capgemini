function square(x){
     return x*x;
}

function double(x){
     return x*2;
}

var x = 5;

function composedValue(square , double , x ){
      return square(double(x));
}

alert(composedValue(square , double , x));