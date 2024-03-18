
param(
    [Parameter(Mandatory=$true)]
    [string]$RepoName,
    [string]$ProjectDir = ".",
    [string]$Name,
    [Parameter(Mandatory=$true)]
    [string]$Version,
    [string]$CodeSigningCert = "",
    [Parameter(Mandatory=$true)]
    [Hashtable]$Keys
)

Write-Output "Entered $RepoName/ci/build-package.ps1"

./java/build-package.ps1 `
    -RepoName $RepoName `
    -ProjectDir $ProjectDir `
    -Name $Name `
    -Version $Version `
    -ExtraArgs "-DskipNativeBuild=true" `
    -JavaGpgKeyPassphrase $Keys['JavaGpgKeyPassphrase'] `
    -JavaPGP $Keys['JavaPGP'] `
    -CodeSigningKeyVaultUrl $Keys['CodeSigningKeyVaultUrl'] `
    -CodeSigningKeyVaultClientId $Keys['CodeSigningKeyVaultClientId'] `
    -CodeSigningKeyVaultTenantId $Keys['CodeSigningKeyVaultTenantId'] `
    -CodeSigningKeyVaultClientSecret $Keys['CodeSigningKeyVaultClientSecret'] `
    -CodeSigningKeyVaultCertificateName $Keys['CodeSigningKeyVaultCertificateName'] `
    -MavenSettings $Keys['MavenSettings'] 


exit $LASTEXITCODE
