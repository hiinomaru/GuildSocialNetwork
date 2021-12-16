package FileSystem;


import QueryManager.AnswerManager;
import QueryManager.RequestManager;
import client.Dialogs.DialogPanel;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*FileSystem.Client_FileSystem C = new FileSystem.Client_FileSystem();
        FileSystem.UserInfo[] U = {new FileSystem.UserInfo("IGOR", 1), new FileSystem.UserInfo("VALERA", 2)};
        FileSystem.Dialog D = new FileSystem.Dialog("Messages", 001, U);
        C.CreateDialog(D);
        System.out.println(C.ReadDialog("002"));
        FileSystem.Message M = new FileSystem.Message("23:50", 1, "444");
        C.WriteDialog(M, "002");*/
        //new Authorization(new JFrame());
        FileSystem.Server_FileSystem Server = new FileSystem.Server_FileSystem();
        //Server.RenewDialog(1 , "12:26");
        RequestManager R = new RequestManager(new DialogPanel());
        AnswerManager A = new AnswerManager(Server);
        A.Handle(R.RENEW_MSG("Igor", 1, "11:07"));
    }
}
