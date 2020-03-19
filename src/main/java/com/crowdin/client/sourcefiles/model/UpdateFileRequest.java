package com.crowdin.client.sourcefiles.model;

import lombok.Data;

@Data
public class UpdateFileRequest extends UpdateOrRestoreFileRequest {

    private Integer storageId;
    private UpdateOption updateOption;
    private ImportOptions importOptions;
    private ExportOptions exportOptions;
}
