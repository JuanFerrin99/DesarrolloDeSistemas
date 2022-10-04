const prompt = require('prompt-sync')();//npm i prompt-sync

function comprobarNumeros(nums) {
    for (let num of nums) {
        if (num % 1 !== 0) {
            return "10"
        }
        else if (typeof num == "string") {
            return "20"
        }
        else if (num == "undifined") {
            return "30"
        }
        else return "0"
    }
}

function comprobarSimbolo(simbolo) {
    if (simbolo == "+" || simbolo == "-" || simbolo == "/" || simbolo == "*") {
        return "0"
    }
    else if (simbolo == "x" || simbolo == "." || simbolo == "%") {
        return "11"
    }
    else if (simbolo == '') {
        return "21"
    }
    else return "31"
}
function comprobar(nums, simbolo) {
    const check1 = comprobarNumeros(nums)
    const check2 = comprobarSimbolo(simbolo)

    if (check1 != "0") { console.log(check1)  }
    else if (check2 != "0") { console.log (check2) } 

    else {
        if (simbolo == "/" && nums[1] == 0) {
            console.log ("12")
        }
        else calcular(nums, simbolo)
    }
}
function calcular(nums, simbolo) {
    let res = 0
    switch (simbolo) {
        case "+":
            res = nums[0] + nums[1]
            break
        case "-":
            res = nums[0] - nums[1]
            break
        case "/":
            res = nums[0] / nums[1]
            break
        case "*":
            res = nums[0] * nums[1]
            break
        default:
            console.log("14")
    }
    //si retornaba res, era undefined ¯\_(ツ)_/¯
    console.log(res)
}

let nums = []

nums[0] = Number(prompt("Ingrese su primer valor "))
let simbolo = prompt("Ingrese el simbolo de la operacion ")
nums[1] = Number(prompt("Ingrese su segundo valor valor "))
comprobar(nums, simbolo)
