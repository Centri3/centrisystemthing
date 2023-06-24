// hypothetical blue dwarf star
Star    "Kond/Lercurnis B"
{
    ParentBody "Lercurnis system bar"
    Class      "A9VI"
    MassSol     0.08
    RadSol      0.11
    Temperature 6460
    // this is probably wrong but SE generates wronger values
    Lum         0.25
    LumBol      0.25
    Age         4570

	RotationPeriod  144
	Obliquity       8.5639
	EqAscendNode    2.6806

    Surface
    {
        /*
        tropicLatitude  0.8
        icecapLatitude  2
        */
		climatePole     0.45
		climateTropic   0
		mareFreq        10
		mareDensity     0.01
		hillsMagn       0
		hillsFreq       50
    }

    Orbit
    {
        RefPlane        "Equator"
        Period			20.7063094
        SemiMajorAxis   6.3
        ArgOfPericenter	180
        MeanAnomaly     0
    }
}
