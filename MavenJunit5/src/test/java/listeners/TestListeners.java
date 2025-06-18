package listeners;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import utilities.Logs;

public class TestListeners implements BeforeEachCallback, AfterEachCallback {
    @Override
    public void afterEach(ExtensionContext context) {
        Logs.info("afterEach: %s", context.getDisplayName());
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        Logs.info("beforeEach: %s", context.getDisplayName());
    }


}
