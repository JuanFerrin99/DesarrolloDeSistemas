const prompt = require('prompt-sync')();

function comprobarNumeros(nums){
    for(num of nums){
        if (num % 2 !== 0){
            return "10"
        }
        else if (typeof num == "string"){
            return "20"
        }
        else if(num == "undifined"){
            return "30"
        }
        else return "0"
    } 
}

function comprobarSimbolo(simbolo){
    if (simbolo == "+" || simbolo == "-" || simbolo == "/" || simbolo == "*"){
        return "0"
    }
    else if (simbolo == "x" ||simbolo == "."|| simbolo == "%" ){
        return "11"
    }
    else if (simbolo == ''){
        return "21"
    }
    console.log (simbolo, typeof simbolo)
    return "31"
}
function comprobar(nums,simbolo){
    const check1 = comprobarNumeros(nums)
    const check2 = comprobarSimbolo(simbolo) 

    if(check1 != "0"){return check1}
    else if(check2 != "0"){return check2}

    else {
        if (simbolo == "/" && nums[1] == 0){
            return "12"
        }
        else calcular(nums,simbolo)
    }
}
function calcular(nums, simbolo) {
    switch (simbolo) {
        case "+":
            return nums[0] + nums[1]

        case "-":
            return nums[0] - nums[1] 

        case "/":
            return nums[0] / nums[1] 

        case "*":
            return nums[0] * nums[1]

        default:
            console.log("14")
    }
}

let nums= []

//nums[0] = prompt("Ingrese su primer valor ")
//let simbolo = prompt("Ingrese el simbolo de la operacion ")
//nums[1] = Number(prompt("Ingrese su segundo valor valor "))
console.log(comprobar([20,50], "+"))
