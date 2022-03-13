function series(num){
     var num1 = 0;
     var num2 = 1;
     var arr = [];
     for(var j=0; j<num;j++){
          arr.push(num1);
          sum = num1+num2;
          arr.push(num1);
          num1 = num2;
          num2 = sum;
     }
     return arr;

}
alert(series(10));