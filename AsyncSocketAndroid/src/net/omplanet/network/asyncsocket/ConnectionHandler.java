package net.omplanet.network.asyncsocket;

/**
 * This interface defines methods that handle connection notifications and the data received from the socket connection.
 * The methods are called from the background thread of the AsyncTask.
 * 
 * Created by StarWheel on 10/08/13.
 */
public interface ConnectionHandler {

    public void didReceiveData(String data);

    public void didDisconnect(Exception error);

    public void didConnect();
}
