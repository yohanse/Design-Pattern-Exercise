package adapter.exercise;

import java.util.ArrayList;
import java.util.List;

public class EmailClient implements EmailProvider {

    private List<EmailProvider> providers = new ArrayList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    @Override
    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }

}
