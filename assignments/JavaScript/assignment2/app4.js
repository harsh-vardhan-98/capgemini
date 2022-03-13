var arr1 = [];
var arr = [1,2,3,4,5];

function map(arr,square){
     arr.forEach(element => {
          arr1.push(square(element));
     });

     return arr1;
};

function square(x){
     return x*x;
};

alert(map(arr,square));