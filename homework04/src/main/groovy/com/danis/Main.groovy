package com.danis

import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder

def fileName = 'file1.json'
def file = getClass().getResource("/${fileName}")

def slurper = new JsonSlurper()
def employee1 = slurper.parseText(file.text) as Employee

println()

def markupHtml = new MarkupBuilder()
markupHtml.html {
    body {
        div {
            div(id: employee1.id) {
                p(value = employee1.name)
                br()
                p(value = employee1.age)
                br()
                p(value = employee1.secretIdentity)
                br()
                ul(id: "powers") {
                    for (def power : employee1.powers) {
                        li(value = power)
                    }
                }
            }
        }
    }
}

def markupXml = new MarkupBuilder()
markupXml.xml {
    employee {
        id(value = employee1.id)
        name(value = employee1.name)
        age(value = employee1.age)
        secretIdentity(value = employee1.secretIdentity)
        powers {
            for (def numPower : employee1.powers) {
                power(value = numPower)
            }
        }
    }
}



class Employee {
    int id
    String name
    int age
    String secretIdentity
    List<Integer> powers
}