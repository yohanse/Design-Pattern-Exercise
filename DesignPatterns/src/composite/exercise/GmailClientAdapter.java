package composite.exercise;

import adapter.exercise.EmailProvider;
import composite.exercise.gmail.GmailClient;

public class GmailClientAdapter implements EmailProvider{
    private GmailClient gmailClient;

    public GmailClientAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
