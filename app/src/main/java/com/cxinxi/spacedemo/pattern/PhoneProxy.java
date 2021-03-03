package com.cxinxi.spacedemo.pattern;

public class PhoneProxy  implements Phone{

    private  Phone targetPhone;

    public  PhoneProxy(){
        if(targetPhone == null) {
            targetPhone = new MobilePhone();
        }
    }

    @Override
    public void call(XList sxList) {
        if( sxList == null || sxList.isEmpty()){
            return;
        }
        targetPhone.call(sxList);
        sxList.remove(0);
        targetPhone.call(sxList);


    }
}
