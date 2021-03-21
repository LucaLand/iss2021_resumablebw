/**
 * IssCommSupport.java
 * ==========================================================================
 * <p>
 * ==========================================================================
 */
package lan.luca.iss2021_resumablebw.supports;

import lan.luca.iss2021_resumablebw.interaction.IssObserver;
import lan.luca.iss2021_resumablebw.interaction.IssOperations;

public interface IssCommSupport extends IssOperations {
    void registerObserver(IssObserver obs);

    void removeObserver(IssObserver obs);

    void close();
}
