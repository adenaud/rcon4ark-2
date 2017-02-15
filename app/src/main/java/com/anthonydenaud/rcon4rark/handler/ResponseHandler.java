package com.anthonydenaud.rcon4rark.handler;

import com.anthonydenaud.rcon4rark.network.Packet;

/**
 * Created by Anthony Denaud on 24/11/16.
 *
 */
public interface ResponseHandler {
    void handleResponse(Packet response);
}
