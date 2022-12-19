package work24;
import javax.swing.*;

interface IDocument {
     void docOpen();
     void docNew();
     void docSave();
     void docPrint();
}

interface ICreateDocument {
        IDocument CreateNew();
        IDocument CreateOpen();
    }

class TextDocument implements IDocument {
    public void docOpen() {
        System.out.println("TextDocument::docOpen()");
    }
    public void docNew() {
        System.out.println("TextDocument::docNew()");
    }
    public void docSave() {
        System.out.println("TextDocument::docSave()");
    }
    public void docPrint() {
        System.out.println("TextDocument::docPrint()");
    }
}

class MusicDocument implements IDocument {
    public void docOpen() {
        System.out.println("MusicDocument::docOpen()");
    }
    public void docNew() {
        System.out.println("MusicDocument::docNew()");
    }
    public void docSave() {
        System.out.println("MusicDocument::docSave()");
    }
    public void docPrint() {
        System.out.println("MusicDocument::docPrint()");
    }
}

class ImageDocument implements IDocument {
    public void docOpen() {
        System.out.println("ImageDocument::docOpen()");
    }
    public void docNew() {
        System.out.println("ImageDocument::docNew()");
    }
    public void docSave() {
        System.out.println("ImageDocument::docSave()");
    }
    public void docPrint() {
        System.out.println("ImageDocument::docPrint()");
    }
}

class CreateTextDocument implements ICreateDocument {
    public IDocument CreateNew() {
        return new TextDocument();
    }
    public IDocument CreateOpen() {
        return new TextDocument();
    }
}

class CreateImageDocument implements ICreateDocument {
    public IDocument CreateNew() {
        return new ImageDocument();
    }
    public IDocument CreateOpen() {
        return new ImageDocument();
    }
}

class CreateMusicDocument implements ICreateDocument {
    public IDocument CreateNew() {
        return new MusicDocument();
    }
    public IDocument CreateOpen() {
        return new MusicDocument();
    }
}
public class Document  extends JFrame {
    private IDocument doc;
    private ICreateDocument createDoc;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu typeMenu;
    private JMenuItem newMenuItem;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem printMenuItem;
    private JMenuItem quitMenuItem;

    private JMenuItem textMenuItem;
    private JMenuItem imageMenuItem;
    private JMenuItem musicMenuItem;

    public Document() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        printMenuItem = new JMenuItem("Print");
        quitMenuItem = new JMenuItem("Quit");

        typeMenu = new JMenu("Type");

        textMenuItem = new JMenuItem("Text");
        imageMenuItem = new JMenuItem("Image");
        musicMenuItem = new JMenuItem("Music");


        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.add(quitMenuItem);
        menuBar.add(fileMenu);

        typeMenu.add(textMenuItem);
        typeMenu.add(imageMenuItem);
        typeMenu.add(musicMenuItem);
        menuBar.add(typeMenu);

        setJMenuBar(menuBar);
    }

    public void SetCreateDoc(ICreateDocument createDoc) {
        this.createDoc = createDoc;
    }

    public void Init() {
        newMenuItem.addActionListener(e -> {
            doc = createDoc.CreateNew();
            doc.docNew();
        });
        openMenuItem.addActionListener(e -> {
            doc = createDoc.CreateOpen();
            doc.docOpen();
        });
        saveMenuItem.addActionListener(e -> {
            doc.docSave();
        });
        printMenuItem.addActionListener(e -> {
            doc.docPrint();
        });
        quitMenuItem.addActionListener(e -> {
            System.exit(0);
        });

        textMenuItem.addActionListener(e -> {
            this.SetCreateDoc(new CreateTextDocument());
        });
        imageMenuItem.addActionListener(e -> {
            this.SetCreateDoc(new CreateImageDocument());
        });
        musicMenuItem.addActionListener(e -> {
            this.SetCreateDoc(new CreateMusicDocument());
        });
    }

    public static void main(String[] args) {
        Document framework = new Document();
        framework.SetCreateDoc(new CreateTextDocument());
        framework.Init();
        framework.setSize(300, 300);
        framework.setVisible(true);
    }
}
