package listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import utilities.Logs;

import java.util.Optional;

public class ResultListeners implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Logs.info("testDisabled: %s", context.getDisplayName());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Logs.info("testSuccessful: %s", context.getDisplayName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Logs.info("testAborted: %s", context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Logs.info("testFailed: %s", context.getDisplayName());
    }
}
