package com.example.zooapp

import android.media.Image

class Animal(){
    var name:String?=null
    var des:String?=null
    var image:Int?=null
    var iskiller:Boolean?=null

    constructor( name:String,des:String,image: Int, iskiller:Boolean) : this() {

        this.name=name
        this.des=des
        this.image=image
        this.iskiller=iskiller

    }
}