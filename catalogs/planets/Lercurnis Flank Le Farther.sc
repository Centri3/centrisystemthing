Moon	"Le Farther/Lercurnis III XI"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            4.12e-05
	Radius          265
	InertiaMoment   0.4
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.675 0.619 0.508)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.793
		Randomize      (-0.377, -0.341, 0.152)
		colorDistMagn   0.0605
		colorDistFreq   36.6
		detailScale     1.02e+03
		drivenDarkening 0.0257
		seaLevel        0.194
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.783
		icecapHeight    0.0898
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.384
		heightTempGrad  0.625
		beachWidth      0.000998
		tropicWidth     0.07
		mainFreq        1.78
		venusFreq       0.546
		venusMagn       0
		mareFreq        0
		mareDensity     0.148
		terraceProb     0.172
		erosion         0
		montesMagn      0.0523
		montesFreq      10.2
		montesSpiky     0.874
		montesFraction  0.157
		dunesMagn       0.05
		dunesFreq       2.12
		dunesFraction   0.676
		hillsMagn       0.109
		hillsFreq       23.9
		hillsFraction   0.138
		hills2Fraction  0.0132
		riversMagn      0
		riversFreq      2.12
		riversSin       4.97
		riftsMagn       0
		riftsFreq       3.8
		riftsSin        6.71
		canyonsMagn     0.407
		canyonsFreq     0.101
		canyonsFraction 0
		cracksMagn      0.0291
		cracksFreq      0.0941
		cracksOctaves   0
		craterMagn      0.899
		craterFreq      0.602
		craterDensity   0.969
		craterOctaves   16
		craterRayedFactor 0.244
		volcanoMagn     0.168
		volcanoFreq     0.901
		volcanoDensity  0.185
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.332
		volcanoRadius   0.149
		volcanoTemp     274
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.3
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
		PeriodDays      4058.65807
		SemiMajorAxisKm 21514284
		Eccentricity    0.503816794
		Inclination     79.6946565
		AscendingNode   -52.2137405
		ArgOfPericenter -101.679389
		MeanAnomaly     0
	}
}

