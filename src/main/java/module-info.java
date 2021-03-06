/**
 * Configuração de dependências do aplicativo.
 * 
 * @author $Author$
 * @author $Committer$
 * @branch $Branch$
 */
module io.github.lvrodrigues.wizard {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.controls;    
    requires de.jensd.fx.glyphs.fontawesome;
    requires com.github.spotbugs.annotations;
    opens io.github.lvrodrigues.wizard to javafx.fxml;
    opens io.github.lvrodrigues.wizard.pages to javafx.fxml;
    exports io.github.lvrodrigues.wizard;
}