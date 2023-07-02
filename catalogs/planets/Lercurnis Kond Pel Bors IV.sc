DwarfMoon	"Bors IV/Lercurnis B VII B-IV"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            4e-05
	Radius          237.13
	InertiaMoment   0.39865
	Oblateness     (0.347, 0.531, 0.000)
	Obliquity       1
	EqAscendNode    -206.11
	TidalLocked     true
    Age             0.005

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_iv.cfg"
		SurfStyle       0.65231
		Randomize      (0.738, 0.467, -0.459)
		colorDistMagn   0.092647
		colorDistFreq   28.785
		detailScale     128
		drivenDarkening 0.17557
		seaLevel        0.093984
		snowLevel       2
		tropicLatitude  0.00017453
		icecapLatitude  2
		icecapHeight    0.58036
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31964
		heightTempGrad  0.625
		beachWidth      0.00099101
		tropicWidth     0.07
		mainFreq        1.2214
		venusFreq       0.82443
		venusMagn       2.7481
		mareFreq        0
		mareDensity     0.16847
		terraceProb     0.36472
		erosion         0
		montesMagn      0.07
		montesFreq      150
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.026928
		dunesFreq       1.7535
		dunesFraction   0.9944
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      59.441
		riversFreq      3.0384
		riversSin       7.2297
		riftsMagn       40.459
		riftsFreq       2.5363
		riftsSin        5.9375
		eqridgeMagn     0.31298
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.4427
		canyonsMagn     0.36531
		canyonsFreq     0.070916
		canyonsFraction 0.99262
		cracksMagn      0.061004
		cracksFreq      0.12542
		cracksOctaves   0
		craterMagn      0.2
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.32824
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.55725
		volcanoTemp     3000
		lavaCoverTidal  0.12446
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.857
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.336825727
		SemiMajorAxisKm 149597.871
		Eccentricity    0.02
		Inclination     1
		AscendingNode   -206.10687
		ArgOfPericenter 24.7328244
		MeanAnomaly     -186.5
	}
}

