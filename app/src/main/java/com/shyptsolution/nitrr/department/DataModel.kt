package com.shyptsolution.nitrr.department

class DataModel(name:String,des:String,other:String) {
    var nam=name
    var description=des
    var others=other
    override fun toString(): String {
        return "DataModel(name='$nam', description='$description', others='$others')"
    }


}