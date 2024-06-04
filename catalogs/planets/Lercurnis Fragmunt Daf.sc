DwarfPlanet	"Daf/Lercurnis A V"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            0.000128
	Radius          360
	InertiaMoment   0.399
	RotationPeriod  84.3
	RotationEpoch   1451545
	Obliquity       -76.8
	EqAscendNode    -1.12

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.521 0.456 0.352)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.0906
		Randomize      (-0.297, -0.646, 0.614)
		colorDistMagn   0.0405
		colorDistFreq   43.9
		detailScale     1.02e+03
		drivenDarkening 0
		seaLevel        0.162
		snowLevel       2
		tropicLatitude  0.974
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.434
		heightTempGrad  0.625
		beachWidth      0.000932
		tropicWidth     0.07
		mainFreq        1.61
		venusFreq       1.32
		venusMagn       0
		mareFreq        0
		mareDensity     0.139
		terraceProb     0.153
		erosion         0
		montesMagn      0.0476
		montesFreq      17.1
		montesSpiky     0.871
		montesFraction  0.0711
		dunesMagn       0.0559
		dunesFreq       3.67
		dunesFraction   0.0656
		hillsMagn       0.121
		hillsFreq       41.6
		hillsFraction   0.3
		hills2Fraction  0.105
		riversMagn      0
		riversFreq      1.9
		riversSin       7.06
		riftsMagn       0
		riftsFreq       4.23
		riftsSin        4.93
		canyonsMagn     0.475
		canyonsFreq     0.125
		canyonsFraction 0
		cracksMagn      0.035
		cracksFreq      0.0879
		cracksOctaves   0
		craterMagn      0.653
		craterFreq      0.929
		craterDensity   0.979
		craterOctaves   16
		craterRayedFactor 0.173
		volcanoMagn     0.177
		volcanoFreq     0.516
		volcanoDensity  0.157
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.301
		volcanoRadius   0.146
		volcanoTemp     202
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.97359928
		SemiMajorAxis   1.85338381
		Eccentricity    0.610687023
		Inclination     -35.7251908
		AscendingNode   -41.221374
		ArgOfPericenter -79.6946565
		MeanAnomaly     0
	}
}

