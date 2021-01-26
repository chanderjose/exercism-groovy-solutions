class ProteinTranslation {
    private static final Map CODONS = [
        'AUG': 'Methionine',
        'UUU': 'Phenylalanine',
        'UUC': 'Phenylalanine',
        'UUA': 'Leucine',
        'UUG': 'Leucine',
        'UCU': 'Serine',
        'UCC': 'Serine',
        'UCA': 'Serine',
        'UCG': 'Serine',
        'UAU': 'Tyrosine',
        'UAC': 'Tyrosine',
        'UGU': 'Cysteine',
        'UGC': 'Cysteine',
        'UGG': 'Tryptophan'
    ]

    private static final List STOP_CODONS = ['UAA', 'UAG', 'UGA']

    static proteins(strand) {
        strand
            .collect().collate(3).collect { it.join('') } // Group characters to get the codon
            .collect { CODONS[it] ?: it }                 // Get the protein from Map
            .takeWhile { !(it in STOP_CODONS) }           // Take proteins until a STOP codon is found
    }
}