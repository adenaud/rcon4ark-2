package com.anthonydenaud.rcon4rark.network;

import com.anthonydenaud.rcon4rark.handler.ResponseHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony Denaud on 24/11/16.
 *
 */

public class SRPConnection {

    private List<ResponseHandler> responseHandlers;

    private int sequencenumber;

    public SRPConnection(){
        responseHandlers = new ArrayList<>();
    }

    public synchronized void addResponseHandler(ResponseHandler responseHandler){
        responseHandlers.add(responseHandler);
    }

    public synchronized void deleteResponseHandler(ResponseHandler responseHandler){
        responseHandlers.remove(responseHandler);
    }

    public synchronized int getSequencenumber(){
        return ++sequencenumber;
    }

}
