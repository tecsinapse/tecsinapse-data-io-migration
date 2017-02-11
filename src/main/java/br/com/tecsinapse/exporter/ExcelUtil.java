package br.com.tecsinapse.exporter;

import br.com.tecsinapse.exporter.servlet.ExportServletUtil;
import br.com.tecsinapse.exporter.util.ExporterUtil;

import java.io.File;
import java.io.IOException;

public final class ExcelUtil {

    /**
     * This method is moved. It will be removed. Use dependency "ts-data-ie-jsf"
     *
     * @deprecated use methods from {@link br.com.tecsinapse.exporter.servlet.ExportServletUtil#facesDownloadXlsx(String, Table)}
     * @throws IOException IOException IOException
     */
    @Deprecated
    public static void exportSXlsx(String name, Table table) throws IOException {
        ExportServletUtil.facesDownloadXlsx(name, table);
    }

    /**
     * This method is moved. It will be removed. Use dependency "ts-data-ie-jsf"
     *
     * @deprecated use methods from {@link br.com.tecsinapse.exporter.servlet.ExportServletUtil#facesDownloadXlsx(String, Table)}
     * @throws IOException IOException IOException
     */
    @Deprecated
    public static void exportXlsx(String name, Table table) throws IOException {
        ExportServletUtil.facesDownloadXlsx(name, table);
    }

    /**
     * This method is moved. It will be removed. Use dependency "ts-data-ie-jsf"
     *
     * @deprecated use methods from {@link br.com.tecsinapse.exporter.servlet.ExportServletUtil#facesDownloadXls(String, Table)}
     * @throws IOException IOException IOException
     */
    @Deprecated
    public static void exportXls(String name, Table table) throws IOException {
        ExportServletUtil.facesDownloadXls(name, table);
    }

    /**
     * This class is moved. It will be removed in future version
     *
     * @deprecated use {@link br.com.tecsinapse.exporter.util.ExporterUtil#getXlsFile(Table, String)}
     */
    @Deprecated
    public static File getXlsFile(Table table, String name) throws IOException {
        return ExporterUtil.getXlsFile(table, name);
    }

    /**
     * This class is moved. It will be removed in future version
     *
     * @deprecated use {@link br.com.tecsinapse.exporter.util.ExporterUtil#getXlsxFile(Table, String)}
     */
    @Deprecated
    public static File getXlsxFile(Table table, String name) throws IOException {
        return ExporterUtil.getXlsxFile(table, name);
    }

    /**
     * This class is moved. It will be removed in future version
     *
     * @deprecated use {@link br.com.tecsinapse.exporter.util.ExporterUtil#getCsvFile(Table, File, String, char)}
     */
    @Deprecated
    public static File getSvFile(Table table, String filename, String charset, char separator) throws IOException {
        return ExporterUtil.getCsvFile(table, filename, charset, separator);
    }
}
